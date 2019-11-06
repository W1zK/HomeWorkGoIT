import Workers.FixWorker;
import Workers.Freelance;
import Workers.HoursWorker;


import java.io.*;
import java.util.Scanner;

public interface FileHandler extends FilePath {
    default void loadCompany() {
        Company.getInstance().setFixedWorker(readFixed(new File(FIXED_WORKER)));
        Company.getInstance().setNonFixWorker(readHoursWorker(new File(NON_FIXED_WORKER)));
        Company.getInstance().setFreelanceWorker(readFreelance(new File(FREELANCE_WORKER)));
    }

    default FixWorker[] readFixed(File path) {
        int lines = 0;
        FixWorker[] fromFile = null;
        if (path.exists()) {
            try {
                Scanner scan = new Scanner(path);
                FileReader reader = new FileReader(path);
                LineNumberReader numLines = new LineNumberReader(reader);
                while (numLines.readLine() != null) {
                    lines++;
                }
                String[] worker;
                if (lines != 0) {
                    fromFile = new FixWorker[lines];
                    for (int i = 0; i < lines; i++) {
                        worker = scan.next().split(",");

                        fromFile[i] = new FixWorker(worker[0], worker[1], Float.parseFloat(worker[2]));
                    }
                }
            } catch (FileNotFoundException | NumberFormatException e) {
                System.out.println("File not found. " + e.fillInStackTrace());
                return new FixWorker[0];
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return fromFile;
    }

    default HoursWorker[] readHoursWorker(File path) {
        int lines = 0;
        HoursWorker[] fromFile = null;
        if (path.exists()) {
            try {
                Scanner scan = new Scanner(path);
                FileReader reader = new FileReader(path);
                LineNumberReader numLines = new LineNumberReader(reader);
                while (numLines.readLine() != null) {
                    lines++;
                }
                String[] worker;
                if (lines != 0) {
                    fromFile = new HoursWorker[lines];
                    for (int i = 0; i < lines; i++) {
                        worker = scan.next().split(",");
                        fromFile[i] = new HoursWorker(worker[0], worker[1], Float.parseFloat(worker[2]), Float.parseFloat(worker[3]), Float.parseFloat(worker[4]));
                    }
                } else Company.getInstance().setNonFixWorker(fromFile);
            } catch (FileNotFoundException | NumberFormatException e) {
                System.out.println("File not found. " + e.fillInStackTrace());
                return new HoursWorker[0];
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return fromFile;
    }

    default Freelance[] readFreelance(File path) {
        int lines = 0;
        Freelance[] fromFile = null;
        if (path.exists()) {
            try {
                Scanner scan = new Scanner(path);
                FileReader reader = new FileReader(path);
                LineNumberReader numLines = new LineNumberReader(reader);
                while (numLines.readLine() != null) {
                    lines++;
                }
                String[] worker;
                if (lines != 0) {
                    fromFile = new Freelance[lines];
                    for (int i = 0; i < lines; i++) {
                        worker = scan.next().split(",");
                        fromFile[i] = new Freelance(worker[0], worker[1], Float.parseFloat(worker[2]), Float.parseFloat(worker[3]));
                    }
                }
            } catch (FileNotFoundException | NumberFormatException e) {
                System.out.println("File not found. " + e.fillInStackTrace());
                return new Freelance[0];
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return fromFile;
    }

    default void saveCompanyInFile() {
        fixWorkerSave(Company.getInstance().getFixedWorker(), new File(FIXED_WORKER));
        hoursWorkerSave(Company.getInstance().getNonFixWorker(), new File(NON_FIXED_WORKER));
        freelanceSave(Company.getInstance().getFreelanceWorker(), new File(FREELANCE_WORKER));
    }

    default void fixWorkerSave(FixWorker[] fixWorkers, File path) {
        creatFile(path);
        try {
            FileWriter writer = new FileWriter(path);
            writer.flush();
            //writer.write(fixWorkers.length + "\n");
            for (FixWorker w : fixWorkers) {
                writer.write(w.getFirstName() + "," + w.getSecondName() + "," + w.getPayment() + "\n");
            }
            writer.close();
        } catch (IOException e) {
            System.out.println("Файл не записан!" + e.toString());
        }
    }

    default void hoursWorkerSave(HoursWorker[] hoursWorkers, File path) {
        creatFile(path);
        try {
            FileWriter writer = new FileWriter(path);
            writer.flush();
            //writer.write(hoursWorkers.length + "\n");
            for (HoursWorker h : hoursWorkers) {
                writer.write(h.getFirstName() + "," + h.getSecondName() + "," + h.getHours() + ","
                        + h.getDays() + "," + h.getPrice() + "\n");
            }
            writer.close();
        } catch (IOException e) {
            System.out.println("Файл не записан!" + e.toString());
        }
    }

    default void freelanceSave(Freelance[] freelance, File path) {
        creatFile(path);
        try {
            FileWriter writer = new FileWriter(path);
            writer.flush();
            //writer.write(freelance.length + "\n");
            for (Freelance f : freelance) {
                writer.write(f.getFirstName() + "," + f.getSecondName() + "," + f.getHours() + ","
                        + f.getPrice() + "\n");
            }
            writer.close();
        } catch (IOException e) {
            System.out.println("Error: file hasn't been written!" + e.toString());
        }
    }

    default void creatFile(File path) {
        try {
            path.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
