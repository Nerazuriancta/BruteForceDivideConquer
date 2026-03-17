package minggu5;

public class tugas {
    int uts[];

    tugas(int uts[]) {
        this.uts = uts;
    }

    int maxDC(int l, int r) {
        if (l==r) {
            return uts[l];
        } else {
            int mid = (l+r) /2;
            int lmax = maxDC(l, mid);
            int rmax = maxDC(mid+1, r);
            return Math.max(lmax, rmax);
        }
    }

    int minDC(int l, int r) {
        if (l==r) {
            return uts[l];
        } else {
            int mid = (l+r) / 2;
            int lmin = minDC(l, mid);
            int rmin = minDC(mid+1, r);
            return Math.min(lmin, rmin);
        }
    }

    int uas[];
    
    double rataBF() {
        int total = 0;
        for(int i=0; i<uas.length; i++) {
            total += uas[i];
        }
        return (double) total/uas.length;
    }
}
