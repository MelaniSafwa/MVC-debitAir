import java.util.*;
class ModelHitung
{
  //function HitungDebit(volume: real, waktu: real) --> real
  double HitungDebit (double volume, double waktu)
  {
    //--> volume / waktu
    return (double) volume / (double) waktu;	//CASTING=polimorfisme coersion
  }
}

class ViewHitung
{
  double volume;		// : real
  double waktu;			// : real
  double debit;			// : real

  //procedure readVolume()
  void readVolume ()
  {
    //{membaca nilai volume dari keyboard}
    System.out.print ("Masukkan volume air sungai : ");
    Scanner input = new Scanner (System.in);
      this.volume = input.nextInt ();
  }
  void readWaktu ()
  {
    //{membaca nilai waktu dari keyboard}
    System.out.print ("Masukkan total waktu : ");
    Scanner input = new Scanner (System.in);
    this.waktu = input.nextInt ();
  }
  //function getVolume() --> real
  double getVolume ()
  {
    return this.volume;		//--> volume
  }
  //function getWaktu() --> real
  double getWaktu ()
  {
    return this.waktu;		//--> waktu
  }
  //procedure setDebit(debit: real)
  void setDebit (double debit)
  {
    this.debit = debit;		//this.debit <-- debit
  }
  //procedure showDebit()
  void showDebit ()
  {
      System.out.println ("Debit air sungai= " + this.debit + " liter/detik");	//output debit
      if (this.debit > 120){
          System.out.println ("Akan terjadi banjir");
      }
      else{
          System.out.println ("Aman, tidak akan terjadi banjir");
      }
  }
}

class ControllerHitung
{
  ModelHitung M;		// : ModelHitung
  ViewHitung V;			// : ViewHitung
  double vol;			// : real
  double w;			// : real
  double d;			// : real

  //constructor ControllerHitung()
    ControllerHitung ()
  {
    M = new ModelHitung ();
    V = new ViewHitung ();
    V.readVolume ();
    V.readWaktu();
    vol = V.getVolume ();
    w = V.getWaktu ();
    d = M.HitungDebit (vol, w);
    V.setDebit (d);
    V.showDebit ();
  }
}
public class Main
{
  public static void main (String[]args)
  {
    ControllerHitung C = new ControllerHitung ();
  }
}
