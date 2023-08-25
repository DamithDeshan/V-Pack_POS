package new_v_pack;

public class New_v_pack {

    public static void main(String[] args) throws InterruptedException {
        Loding loding = new Loding();
        loding.setVisible(true);
        for(float i= 0.0f;i<=100.0f;i=i+0.1f){
            Thread.sleep(15);
            Loding.lblPrasentage.setText(String.format("%.1f", i )+" %");
            Loding.prbLoadingBar.setValue((int)i);
            if(i<80f){
                Loding.lblStatas.setText(" . . . Loading . . . ");
            }else if((i>=80f) && (i<95f)){
                Loding.lblStatas.setText(" . . . System Ready . . . ");
            }else if((i>=95f)&&(i<100f)){
                Loding.lblStatas.setText(" . . . Ready . . . ");
            }
        }
        Thread.sleep(100);
        loding.hide();
        Login login = new Login();
        login.setVisible(true);
    }
}
