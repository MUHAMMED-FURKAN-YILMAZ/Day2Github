public class Day2GitGithub {
    /*
    1- git init --> local repo olusturmak icin.  Yani .git ile klasorumuzun icindeki
                    dosyalari iliskilendirmek icin kullanilir

    2- git add . --> Working space'den(yani yerel) dosyalarimi staging area'ya 
                     (yani commitlemek icin beklenen yer) gonderir
                     
    3- git commit -m "message" --> Staging area'dan commit store'a dosyalarimi gondermek icin kullanilir
                                   (commit uani version-surum olusturmus olurum)

    4- git push --> uzak repo'ya(remote - github) gondermek icin kullandigimiz komut.
                   (Yalniz git push'u direk kullanmak istersek 1 kez su komutlari yazmaliyiz
                   git remote add origin address
                   git push -u origin master
          Not: Yukaridaki iki komutu tek sefer kullandiktan sonra 2. commitlerim icin sadece git push kullaniriz

          Not: git log --oneline --> Commitlerdeki-Version'lardaki durumu gosterir

     5- git pull --> remote dosyalarimizi locale cekmemizi saglar

     */
    public static void main(String[] args) {
        System.out.println("Branch 1. deneme");
        System.out.println("Master 1. deneme");
        System.out.println("Branch 2. deneme");
    }
}
