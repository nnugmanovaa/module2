package classwor3;

public class CompositionSample {
    private Particle particle;

    public CompositionSample(){
        this.particle=new Particle();
    }

    public CompositionSample(String name){
        this.particle=new Particle(name);
    }

    public Particle getParticle() {
        return particle;
    }

    public void setParticle(Particle particle) {
        this.particle = particle;
    }
}
