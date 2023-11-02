public class Sports {
    int scored,concede,totalPoint,played,won,draw,loss;
    String name,type;

    public Sports(String type, String name) {
        this.type = type;
        this.name = name;
        this.scored = 0;
        this.concede = 0;
        this.won = 0;
        this.draw = 0;
        this.loss = 0;
        this.totalPoint = 0;
        this.played = 0;
    }

    public void updated(int scored,int concede) {
        this.played++;
        if (scored>concede) {
            this.won++;
            this.totalPoint+=3;
        } else if (scored == concede) {
            this.draw++;
            this.totalPoint++;
        }else {
            loss++;
        }

        this.scored += scored;
        this.concede +=concede;
    }

    public void updatedH(int scored,int concede) {
        this.played++;
        if (scored>concede) {
            this.won++;
            this.totalPoint+=2;
        } else if (scored == concede) {
            this.draw++;
            this.totalPoint++;
        }else {
            loss++;
        }

        this.scored += scored;
        this.concede +=concede;
    }

    public void updatedB(int scored,int concede) {
        this.played++;
        if (scored>concede) {
            this.won++;
            this.totalPoint+=2;
        }
        else {
            loss++;
            this.totalPoint+=1;
        }

        this.scored += scored;
        this.concede +=concede;
    }

    public void updatedV(int scored,int concede) {
        this.played++;
        this.scored += scored;
        this.concede +=concede;
        if (scored == 3 && concede == 1 || scored == 3 && concede == 0) {
            this.won++;
            this.totalPoint+=3;
        } else if (scored == 3 && concede == 2) {
            this.won++;
            this.totalPoint+=2;
        }else if (scored == 2 && concede == 3) {
            this.loss++;
            this.totalPoint+=1;
        }
        else {
            this.loss++;
        }
    }

    public String toString()
    {

        String all =this.type + "    " + this.name + "    " + this.played + "    " + this.won + "    " + this.draw + "    " + this.loss + "    " + this.scored + "    " + this.concede + "    " + this.totalPoint;

        return all;
    }
}
