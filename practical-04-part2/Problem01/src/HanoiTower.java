//==================================
// Foundations of Computer Science
// Student: Yiqi Li
// id: a1787585
// Semester: Senemter 2
// Year: 2020
// Practical Number: 4
//===================================
public class HanoiTower {
    static int move = 0;        //mark moves
    private int dTmp;

    private void move(int disk, int poleA, int poleB) {
        System.out.printf("S%d: Move the disk %d from Pole%d to Pole%d\n", ++move, disk, poleA, poleB);
    }

    public void solve(int disk) throws IntegerInputException {
        if (disk > 0) {
            Hanoi(disk, 1, 2, 3);
        } else {
            throw new IntegerInputException();
        }
    }

    private void Hanoi(int disk, int a, int b, int c) {
        if (disk == 1) {
            move(1, a, c);
        } else {
            //Recursion: move the disks 1 ~ n-1 on tower A to B, and take C as auxiliary tower
            Hanoi(disk - 1, a, c, b);
            move(disk, a, c);
            //Recursion: move the disks 1 ~ n-1 on tower B to C, and take A as auxiliary tower
            Hanoi(disk - 1, b, a, c);
        }

    }

    public HanoiTower() {
        solve(3);
    }

    public HanoiTower(int dTmp) {
        solve(dTmp);
        this.dTmp = dTmp;
    }

    public int getdTmp() {
        return dTmp;
    }

    public void setdTmp(int dTmp) {
        this.dTmp = dTmp;
    }
}
