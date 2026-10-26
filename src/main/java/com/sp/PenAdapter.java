package com.sp;

import com.krishna.Pilotpen;

public class PenAdapter implements Pen{
Pilotpen p=new Pilotpen();
    @Override
    public void write(String msg) {
        p.mark(msg);
    }
}
