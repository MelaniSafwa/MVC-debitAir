Studi Kasus
Saat ini sedang musim penghujan dan menyebabkan banjir dimana - mana. Sehingga akan dibuat program untuk menghitung besar aliran sungai pada setiap waktu tertentu yang berguna untuk mendeteksi banjir. Digunakan arsitektur MVC untuk membuat program tersebut

Model : Untuk perhitungan debit air (Perhitungan debit air)
View : Representasi visual dari perhitungan (Form Perhitungan)
Controller : menentukan action yang dilakukan (PerhitunganController)

program MVC
{Penerapan MVC kasus menghitung besar aliran sungai setiap waktu}

class ModelHitung {public}
	{behaviour}
	function HitungDebit(volume: real, waktu: real) --> real {public}
		--> volume / waktu
	
	
class ViewHitung
	{atributtes}
	volume: real, protected
	waktu: real, protected
	debit: real, protected
	
	{behaviour}
	procedure readVolume()
	{membaca nilai volume dari keyboard}
	
	procedure readWaktu()
	{membaca nilai waktu dari keyboard}
	
	function getVolume() --> real
		--> volume
		
	function getWaktu() --> real
		--> waktu
		
	procedure setDebit(debit: real)
		this.debit <-- debit
		
	procedure showDebit()
		output debit
		if this.debit > 120 then
			output (Akan terjadi banjir)
		else
			output (Aman, tidak akan terjadi banjir)

class ControllerHitung: {public}
	{atributtes}
	M 	: ModelHitung, private
	V 	: ViewHitung, private
	vol : real, private
	w 	: real, private
	d 	: real, private
	{behaviour}
	constructor ControllerHitung()
		M : new ModelHitung
		V : new ViewHitung
		V.readVolume()
		V.readWaktu()
		vol 	<-- V.getVolume()
		w 		<-- V.getWaktu()
		d		<-- M.HitungDebit(vol, w)
		V.setDebit(d)
		V.showDebit()

class Main: {public}
	C : ControllerHitung, public
	C <-- new ControllerHitung
