public class Projetor extends Equipamento{
    private boolean hdmi;
    private boolean vga;

    public Projetor(boolean hdmi, boolean vga) {
        this.hdmi = hdmi;
        this.vga = vga;
    }

    public boolean isHdmi() {
        return hdmi;
    }

    public void setHdmi(boolean hdmi) {
        this.hdmi = hdmi;
    }

    public boolean isVga() {
        return vga;
    }

    public void setVga(boolean vga) {
        this.vga = vga;
    }
}
