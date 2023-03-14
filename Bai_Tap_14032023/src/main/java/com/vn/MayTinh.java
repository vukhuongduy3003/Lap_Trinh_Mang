package com.vn;

public class MayTinh extends QLH {
    private Integer tgbh;

    public Integer getTgbh() {
        return tgbh;
    }

    @Override
    public void input() {
        super.input();
        System.out.print("Nhập thời gian bảo hành: ");
        this.tgbh = Program.NhapSoNguyenDuong();
    }

    @Override
    public void output() {
        super.output();
        System.out.printf("%-30s\n", this.tgbh);
    }
}
