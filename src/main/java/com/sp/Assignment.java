package com.sp;

public class Assignment {
    private Pen p;

    public Pen getP() {
        return p;
    }

    public void setP(Pen p) {
        this.p = p;
    }

    public void writeAss(String msg)
    {
        p.write(msg);
    }
}
