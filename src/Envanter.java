package Oyun009.src;

public class Envanter {

    private  String silahAdi, zirhAdi;
    private int zirh, hasar;
    private boolean su, yiyecek, odun;

    public Envanter() {
        this.silahAdi = null;
        this.zirhAdi = null;
        this.zirh = 0;
        this.hasar = 0;
        this.su = false;
        this.yiyecek = false;
        this.odun = false;
    }

    public String getSilahAdi() {
        return silahAdi;
    }

    public String getZirhAdi() {
        return zirhAdi;
    }

    public int getZirh() {
        return zirh;
    }

    public int getHasar() {
        return hasar;
    }

    public boolean isSu() {
        return su;
    }

    public boolean isYiyecek() {
        return yiyecek;
    }

    public boolean isOdun() {
        return odun;
    }

    public void setSilahAdi(String silahAdi) {
        this.silahAdi = silahAdi;
    }

    public void setZirhAdi(String zirhAdi) {
        this.zirhAdi = zirhAdi;
    }

    public void setZirh(int zirh) {
        this.zirh = zirh;
    }

    public void setHasar(int hasar) {
        this.hasar = hasar;
    }

    public void setSu(boolean su) {
        this.su = su;
    }

    public void setYiyecek(boolean yiyecek) {
        this.yiyecek = yiyecek;
    }

    public void setOdun(boolean odun) {
        this.odun = odun;
    }

}
