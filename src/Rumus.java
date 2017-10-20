/*

==================Copyright by===============
|  Ahmad Rizal M           135150207111051  |
|  Brillian Aristyo R      135150200111124  |
|  Iman Aidil N            135150207111041  |
|  Muchibbuddin Abas       135150201111092  |
=====================2015====================

----------------------------------------------------------------------------

Method yang wajib dipanggil
setNilai(0,1,2,3,4,5,6,7,8,9);
setGauss___();                  --> fakultas yang diinginkan
peluangKelasterhadapFitur();
getPeluang___();                --> fakultas yang diinginkan

*/

public class Rumus {

    private double g1, g2, g3, gauss;

    //rataan
    private double meanFK[] = new double[10];       //kedokteran
    private double meanFILKOM[] = new double[10];   //ilmu komputer
    private double meanFT[] = new double[10];       //teknik
    private double meanFMIPA[] = new double[10];    //matematika dan ipa
    private double meanFP[] = new double[10];       //pertanian
    private double meanFPT[] = new double[10];      //peternakan
    private double meanFTP[] = new double[10];      //teknologi pertanian
    private double meanFPIK[] = new double[10];     //perikanan kelautan
    private double meanNon[] = new double[10];      //tidak diterima

    //standar deviasi
    private double devFK[] = new double[10];       //kedokteran
    private double devFILKOM[] = new double[10];   //ilmu komputer
    private double devFT[] = new double[10];       //teknik
    private double devFMIPA[] = new double[10];    //matematika dan ipa
    private double devFP[] = new double[10];       //pertanian
    private double devFPT[] = new double[10];      //peternakan
    private double devFTP[] = new double[10];      //teknologi pertanian
    private double devFPIK[] = new double[10];     //perikanan kelautan
    private double devNon[] = new double[10];      //tidak diterima

    //gaussian setiap fakultas
    private double gaussFK[] = new double[10];       //kedokteran
    private double gaussFILKOM[] = new double[10];   //ilmu komputer
    private double gaussFT[] = new double[10];       //teknik
    private double gaussFMIPA[] = new double[10];    //matematika dan ipa
    private double gaussFP[] = new double[10];       //pertanian
    private double gaussFPT[] = new double[10];      //peternakan
    private double gaussFTP[] = new double[10];      //teknologi pertanian
    private double gaussFPIK[] = new double[10];     //perikanan kelautan
    private double gaussNon[] = new double[10];      //tidak diterima

    private double nilai[] = new double[11];         //nilai setiap pelajaran

    private double fakultas[] = new double[9];      //nilai peluang kelas

    public Rumus() {
        //inisialisasi nilai rataan pelajaran di fk
        meanFK[0] = 88.2;         //agama
        meanFK[1] = 87.4;         //ppkn
        meanFK[2] = 82.4;         //bind
        meanFK[3] = 89;           //bing
        meanFK[4] = 88.6;         //mat
        meanFK[5] = 88.4;         //fis
        meanFK[6] = 91;           //kim
        meanFK[7] = 91.4;         //bio
        meanFK[8] = 84.8;         //sej
        meanFK[9] = 84.8;           //tik

        //inisialisasi nilai rataan pelajaran di filkom
        meanFILKOM[0] = 85.2;           //agama
        meanFILKOM[1] = 85.2;         //ppkn
        meanFILKOM[2] = 85.8;         //bind
        meanFILKOM[3] = 86.6;           //bing
        meanFILKOM[4] = 90.4;         //mat
        meanFILKOM[5] = 87.2;         //fis
        meanFILKOM[6] = 84.6;         //kim
        meanFILKOM[7] = 82;         //bio
        meanFILKOM[8] = 78.8;         //sej
        meanFILKOM[9] = 88.8;         //tik

        //inisialisasi nilai rataan pelajaran di teknik
        meanFT[0] = 81.2;         //agama
        meanFT[1] = 80.8;         //ppkn
        meanFT[2] = 82.2;         //bind
        meanFT[3] = 87.4;         //bing
        meanFT[4] = 86.6;         //mat
        meanFT[5] = 88;         //fis
        meanFT[6] = 85.6;         //kim
        meanFT[7] = 79.4;         //bio
        meanFT[8] = 79;         //sej
        meanFT[9] = 84;         //tik

        //inisialisasi nilai rataan pelajaran di mipa
        meanFMIPA[0] = 83.4;         //agama
        meanFMIPA[1] = 79.2;         //ppkn
        meanFMIPA[2] = 80.8;         //bind
        meanFMIPA[3] = 85;           //bing
        meanFMIPA[4] = 87;           //mat
        meanFMIPA[5] = 84.8;         //fis
        meanFMIPA[6] = 83.2;         //kim
        meanFMIPA[7] = 81.2;         //bio
        meanFMIPA[8] = 76.8;         //sej
        meanFMIPA[9] = 77.6;         //tik

        //inisialisasi nilai rataan pelajaran di pertanian
        meanFP[0] = 76.6;         //agama
        meanFP[1] = 76.6;         //ppkn
        meanFP[2] = 75.6;         //bind
        meanFP[3] = 78;           //bing
        meanFP[4] = 75;           //mat
        meanFP[5] = 74.6;         //fis
        meanFP[6] = 78.2;         //kim
        meanFP[7] = 80;           //bio
        meanFP[8] = 72.6;         //sej
        meanFP[9] = 73.4;         //tik

        //inisialisasi nilai rataan pelajaran di peternakan
        meanFPT[0] = 81.6;        //agama
        meanFPT[1] = 78.2;        //ppkn
        meanFPT[2] = 74.4;        //bind
        meanFPT[3] = 80.6;        //bing
        meanFPT[4] = 77.6;        //mat
        meanFPT[5] = 76.2;        //fis
        meanFPT[6] = 79.4;        //kim
        meanFPT[7] = 79.8;        //bio
        meanFPT[8] = 75.2;        //sej
        meanFPT[9] = 77;          //tik

        //inisialisasi nilai rataan pelajaran di teknologi pertanian
        meanFTP[0] = 80.8;        //agama
        meanFTP[1] = 78.6;        //ppkn
        meanFTP[2] = 80.6;        //bind
        meanFTP[3] = 83;          //bing
        meanFTP[4] = 82.4;        //mat
        meanFTP[5] = 82.2;        //fis
        meanFTP[6] = 82.2;        //kim
        meanFTP[7] = 79.6;        //bio
        meanFTP[8] = 76.8;        //sej
        meanFTP[9] = 76;          //tik

        //inisialisasi nilai rataan pelajaran di perikanan kelautan
        meanFPIK[0] = 76.6;        //agama
        meanFPIK[1] = 71.6;        //ppkn
        meanFPIK[2] = 72;          //bind
        meanFPIK[3] = 71.6;        //bing
        meanFPIK[4] = 71.6;        //mat
        meanFPIK[5] = 72;          //fis
        meanFPIK[6] = 77.8;        //kim
        meanFPIK[7] = 77.8;        //bio
        meanFPIK[8] = 72.6;        //sej
        meanFPIK[9] = 72.6;        //tik
        
        //inisialisasi nilai rataan jika tidak diterima
        meanNon[0] = 64.4;        //agama
        meanNon[1] = 60.2;        //ppkn
        meanNon[2] = 58;          //bind
        meanNon[3] = 63.4;        //bing
        meanNon[4] = 64.2;        //mat
        meanNon[5] = 61;          //fis
        meanNon[6] = 59.6;        //kim
        meanNon[7] = 58;        //bio
        meanNon[8] = 54.4;        //sej
        meanNon[9] = 58;        //tik

        //-----------------------------------------------------------------
        //inisialisasi standar deviasi pelajaran di fk
        devFK[0] = 3.114482;         //agama
        devFK[1] = 1.67332;         //ppkn
        devFK[2] = 1.140175;         //bind
        devFK[3] = 1.581139;          //bing
        devFK[4] = 1.140175;         //mat
        devFK[5] = 1.140175;         //fis
        devFK[6] = 2.236068;        //kim
        devFK[7] = 2.408319;         //bio
        devFK[8] = 1.30384;         //sej
        devFK[9] = 3.271085;         //tik

        //inisialisasi standar deviasi pelajaran di filkom
        devFILKOM[0] = 1.923538;         //agama
        devFILKOM[1] = 1.923538;         //ppkn
        devFILKOM[2] = 1.30384;         //bind
        devFILKOM[3] = 1.140175;         //bing
        devFILKOM[4] = 1.140175;         //mat
        devFILKOM[5] = 1.30384;          //fis
        devFILKOM[6] = 1.140175;         //kim
        devFILKOM[7] = 1.870829;          //bio
        devFILKOM[8] = 0.83666;          //sej
        devFILKOM[9] = 1.30384;          //tik

        //inisialisasi standar deviasi pelajaran di teknik
        devFT[0] = 1.30384;         //agama
        devFT[1] = 1.643168;         //ppkn
        devFT[2] = 1.48324;         //bind
        devFT[3] = 1.140175;         //bing
        devFT[4] = 1.140175;         //mat
        devFT[5] = 1.581139;         //fis
        devFT[6] = 1.81659;         //kim
        devFT[7] = 1.67332;         //bio
        devFT[8] = 1;         //sej
        devFT[9] = 1.581139;         //tik

        //inisialisasi standar deviasi pelajaran di mipa
        devFMIPA[0] = 0.894427;        //agama
        devFMIPA[1] = 1.30384;         //ppkn
        devFMIPA[2] = 1.923538;        //bind
        devFMIPA[3] = 1.581139;        //bing
        devFMIPA[4] = 1.581139;        //mat
        devFMIPA[5] = 1.788854;        //fis
        devFMIPA[6] = 1.788854;        //kim
        devFMIPA[7] = 1.923538;        //bio
        devFMIPA[8] = 2.167948;        //sej
        devFMIPA[9] = 1.516575;        //tik

        //inisialisasi standar deviasi pelajaran di pertanian
        devFP[0] = 1.140175;           //agama
        devFP[1] = 1.516575;           //ppkn
        devFP[2] = 1.516575;           //bind
        devFP[3] = 1.870829;           //bing
        devFP[4] = 1.224745;           //mat
        devFP[5] = 1.67332;            //fis
        devFP[6] = 1.923538;           //kim
        devFP[7] = 1.224745;           //bio
        devFP[8] = 1.140175;           //sej
        devFP[9] = 0.547723;           //tik

        //inisialisasi standar deviasi pelajaran di peternakan
        devFPT[0] = 2.073644;        //agama
        devFPT[1] = 1.30384;         //ppkn
        devFPT[2] = 1.516575;        //bind
        devFPT[3] = 1.516575;        //bing
        devFPT[4] = 2.073644;        //mat
        devFPT[5] = 1.30384;         //fis
        devFPT[6] = 1.81659;         //kim
        devFPT[7] = 1.788854;        //bio
        devFPT[8] = 2.167948;        //sej
        devFPT[9] = 2;               //tik

        //inisialisasi standar deviasi pelajaran di teknologi pertanian
        devFTP[0] = 0.83666;         //agama
        devFTP[1] = 0.894427;        //ppkn
        devFTP[2] = 1.949359;        //bind
        devFTP[3] = 1.224745;        //bing
        devFTP[4] = 2.302173;        //mat
        devFTP[5] = 1.788854;        //fis
        devFTP[6] = 2.774887;        //kim
        devFTP[7] = 1.140175;        //bio
        devFTP[8] = 2.167948;        //sej
        devFTP[9] = 1.224745;        //tik

        //inisialisasi standar deviasi pelajaran di perikanan kelautan
        devFPIK[0] = 1.140175;        //agama
        devFPIK[1] = 2.073644;        //ppkn
        devFPIK[2] = 1.224745;        //bind
        devFPIK[3] = 1.140175;        //bing
        devFPIK[4] = 1.140175;        //mat
        devFPIK[5] = 1.870829;        //fis
        devFPIK[6] = 1.30384;         //kim
        devFPIK[7] = 1.48324;         //bio
        devFPIK[8] = 1.140175;        //sej
        devFPIK[9] = 1.516575;        //tik
        
        //inisialisasi standar deviasi jika tidak diterima
        devNon[0] = 3.04949;        //agama
        devNon[1] = 4.834058;        //ppkn
        devNon[2] = 4.301163;        //bind
        devNon[3] = 2.701851;        //bing
        devNon[4] = 2.863564;        //mat
        devNon[5] = 2.236068;        //fis
        devNon[6] = 2.073644;        //kim
        devNon[7] = 2.236068;        //bio
        devNon[8] = 2.302173;        //sej
        devNon[9] = 1.581139;        //tik
    }

    //mengeset nilai gaussian dengan inputan nilai pelajaran sebagai parameter x
    public void setGaussian(double ragam, double x, double rataan) {
        g1 = 1 / Math.sqrt(2 * 22 / 7 * ragam * ragam);
        g3 = -((x - rataan) * (x - rataan)) / (2 * ragam * ragam);
        g2 = Math.pow(2.718, g3);
        gauss = g1 * g2;
    }

    //mengambil nilai gaussian
    public double getGaussian() {
        return gauss;
    }

    //set nilai masing-masing pelajaran
    //agama, ppkn, bind, bing, mat, fis, kim, bio, sej, tik
    public void setNilai(double a, double b, double c, double d, double e, double f, double g, double h, double i, double j) {
        nilai[0] = a;
        nilai[1] = b;
        nilai[2] = c;
        nilai[3] = d;
        nilai[4] = e;
        nilai[5] = f;
        nilai[6] = g;
        nilai[7] = h;
        nilai[8] = i;
        nilai[9] = j;
    }

    //set nilai gaussian setiap fakultas
    public void setGaussFK() {
        for (int i = 0; i < 10; i++) {
            setGaussian(devFK[i], nilai[i], meanFK[i]);
            gaussFK[i] = getGaussian();
        }
    }

    public void setGaussFILKOM() {
        for (int i = 0; i < 10; i++) {
            setGaussian(devFILKOM[i], nilai[i], meanFILKOM[i]);
            gaussFILKOM[i] = getGaussian();
        }
    }

    public void setGaussFT() {
        for (int i = 0; i < 10; i++) {
            setGaussian(devFT[i], nilai[i], meanFT[i]);
            gaussFT[i] = getGaussian();
        }
    }

    public void setGaussFMIPA() {
        for (int i = 0; i < 10; i++) {
            setGaussian(devFMIPA[i], nilai[i], meanFMIPA[i]);
            gaussFMIPA[i] = getGaussian();
        }
    }

    public void setGaussFP() {
        for (int i = 0; i < 10; i++) {
            setGaussian(devFP[i], nilai[i], meanFP[i]);
            gaussFP[i] = getGaussian();
        }
    }

    public void setGaussFPT() {
        for (int i = 0; i < 10; i++) {
            setGaussian(devFPT[i], nilai[i], meanFPT[i]);
            gaussFPT[i] = getGaussian();
        }
    }

    public void setGaussFTP() {
        for (int i = 0; i < 10; i++) {
            setGaussian(devFTP[i], nilai[i], meanFTP[i]);
            gaussFTP[i] = getGaussian();
        }
    }

    public void setGaussFPIK() {
        for (int i = 0; i < 10; i++) {
            setGaussian(devFPIK[i], nilai[i], meanFPIK[i]);
            gaussFPIK[i] = getGaussian();
        }
    }
    
    public void setGaussNon() {
        for (int i = 0; i < 10; i++) {
            setGaussian(devNon[i], nilai[i], meanNon[i]);
            gaussNon[i] = getGaussian();
        }
    }

    //set nilai peluang kelas terhadap semua fitur --> p(Fakultas|nilai1,nilai2,nilai3,nilai4,.......,nilai9,nilai10)
    public void peluangKelasterhadapFitur() {
        fakultas[0]=gaussFK[0]*gaussFK[1]*gaussFK[2]*gaussFK[3]*gaussFK[4]*gaussFK[5]*gaussFK[6]*gaussFK[7]*gaussFK[8]*gaussFK[9];
        fakultas[1]=gaussFILKOM[0]*gaussFILKOM[1]*gaussFILKOM[2]*gaussFILKOM[3]*gaussFILKOM[4]*gaussFILKOM[5]*gaussFILKOM[6]*gaussFILKOM[7]*gaussFILKOM[8]*gaussFILKOM[9];
        fakultas[2]=gaussFT[0]*gaussFT[1]*gaussFT[2]*gaussFT[3]*gaussFT[4]*gaussFT[5]*gaussFT[6]*gaussFT[7]*gaussFT[8]*gaussFT[9];
        fakultas[3]=gaussFMIPA[0]*gaussFMIPA[1]*gaussFMIPA[2]*gaussFMIPA[3]*gaussFMIPA[4]*gaussFMIPA[5]*gaussFMIPA[6]*gaussFMIPA[7]*gaussFMIPA[8]*gaussFMIPA[9];
        fakultas[4]=gaussFP[0]*gaussFP[1]*gaussFP[2]*gaussFP[3]*gaussFP[4]*gaussFP[5]*gaussFP[6]*gaussFP[7]*gaussFP[8]*gaussFP[9];
        fakultas[5]=gaussFPT[0]*gaussFPT[1]*gaussFPT[2]*gaussFPT[3]*gaussFPT[4]*gaussFPT[5]*gaussFPT[6]*gaussFPT[7]*gaussFPT[8]*gaussFPT[9];
        fakultas[6]=gaussFTP[0]*gaussFTP[1]*gaussFTP[2]*gaussFTP[3]*gaussFTP[4]*gaussFTP[5]*gaussFTP[6]*gaussFTP[7]*gaussFTP[8]*gaussFTP[9];
        fakultas[7]=gaussFPIK[0]*gaussFPIK[1]*gaussFPIK[2]*gaussFPIK[3]*gaussFPIK[4]*gaussFPIK[5]*gaussFPIK[6]*gaussFPIK[7]*gaussFPIK[8]*gaussFPIK[9];
        fakultas[8]=gaussNon[0]*gaussNon[1]*gaussNon[2]*gaussNon[3]*gaussNon[4]*gaussNon[5]*gaussNon[6]*gaussNon[7]*gaussNon[8]*gaussNon[9];
    }

    //mendapatkan nilai peluang dari setiap fakultas
    public double getPeluangFK(){
        return fakultas[0];
    }
    
    public double getPeluangFILKOM(){
        return fakultas[1];
    }
    
    public double getPeluangFT(){
        return fakultas[2];
    }
    
    public double getPeluangFMIPA(){
        return fakultas[3];
    }
    
    public double getPeluangFP(){
        return fakultas[4];
    }
    
    public double getPeluangFPT(){
        return fakultas[5];
    }
    
    public double getPeluangFTP(){
        return fakultas[6];
    }
    
    public double getPeluangFPIK(){
        return fakultas[7];
    }
    
    public double getPeluangNon(){
        return fakultas[8];
    }
    
}
