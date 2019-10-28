package Specific;



public class VideoCard extends Cpu implements TechSpecification {
    public VideoMemory videoCard;


    public VideoCard(int core, double freq) {
        super(core, freq);
    }
}
