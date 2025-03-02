package edb;
// Generated 27.11.2019 8:43:52 by Hibernate Tools 4.3.1


import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


//этот класс создаётся сам по себе, как и класс Gruppyi
//catalog="gr" - название нашей бд
//name="studentyi" - название таблицы
/**
 * Studentyi generated by hbm2java
 */
@Entity
@Table(name="studentyi"
    ,catalog="gr"
)


public class Studentyi  implements java.io.Serializable {

// тут записаны характеристкики(свойства)(ФИО и т.д) , которыми долженОбладатьКаждыйСтудент
     private long nomerZachetki;//long  - это тип переменной для длинных чисел...
     private Gruppyi gruppyi;
     private String familiya;//вот например свойство, которым Должен обладать студент .долженИметьФамилию
     private String imya;
     private String otchestvo;
     private String gorod;
     private String adres;
     private String tel;
     private String status;
     private Date statusDate;

     
     //самый простой конструктор, с помощью него мы такой строчкой Studentyi student = new Studentyi(); ...
     //...можем зарегестрировать(создать) студента, но он сразу не будет иметь имя null,  фамилию null ну и ...
     //...для всего остального пустые значения. С помощью этого конструктора
     //... мы можем отвести ему место в памяти 
    public Studentyi() {
    }

	//получше конструктор, теперь мы можем создать студента строкой например
    //...Studentyi studentInga = new Student(17598, IT-5,Иванов, Иван, Иванович, Витебск, Московствий, +375555555);
    
    //..таким обзоам мы сразу можем создать студента с практичесвки всеми его свойствами(Фио, группа и т.д)
    public Studentyi(long nomerZachetki, Gruppyi gruppyi, String familiya, String imya, String otchestvo, String gorod, String adres, String tel) {
        this.nomerZachetki = nomerZachetki;//Присваиваем свойству должнБытьЗачётка - учётку, которую мы ввели, теперь ...
        //в отличие от предыдущего конструктора номер зачётки не пуствой - из моего примера тут мы присваиваем мне зачётку,
        //номером 17672
        
        //this ниже означает, что те свойства, которые мы описали в верху, которые ДОЛЖНЫ БЫТЬ У КАЖДОГО СТУДЕНТА 
        this.gruppyi = gruppyi;//именно тут присваивается группа, в которой я учусь, я ввел IT-5, значит мне присвоилась группа IT-5
        this.familiya = familiya;//тут мне присваивается Фамилия Иванов
        this.imya = imya;//имя и т.д
        this.otchestvo = otchestvo;
        this.gorod = gorod;
        this.adres = adres;
        this.tel = tel;
    }
    //ещё один конструктор , всё тоже самое, только добавлены поля String status, Date statusDate
    //а так работает аналогично
    public Studentyi(long nomerZachetki, Gruppyi gruppyi, String familiya, String imya, String otchestvo, String gorod, String adres, String tel, String status, Date statusDate) {
       this.nomerZachetki = nomerZachetki;
       this.gruppyi = gruppyi;
       this.familiya = familiya;
       this.imya = imya;
       this.otchestvo = otchestvo;
       this.gorod = gorod;
       this.adres = adres;
       this.tel = tel;
       this.status = status;
       this.statusDate = statusDate;
    }
   
     @Id 

    
    @Column(name="NomerZachetki", unique=true, nullable=false)
    public long getNomerZachetki() {//public long - означает, что этот метод доступен всем(не только этому классу) и будет...
        //...возвращать тип long -  длинное число
        return this.nomerZachetki;//когда этот метод вызван из другого класса, программа видит этот метод и переходит сюда,
        //...чтобы понять, что нужно сделать. в данном случает нужно возвратить номер зачётки студента.
        //т.е например studentInga.getNometZachenki(); - выдаст число 17672.
        //return - возращение
    }
    
    public void setNomerZachetki(long nomerZachetki) {
        this.nomerZachetki = nomerZachetki;//присваиваем номеру зачётки значение, которое ввели в скобках
    }

    //дальше всё аналогичгно
@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="ShifrGruppyi", nullable=false)
    public Gruppyi getGruppyi() {
        return this.gruppyi;
    }
    
    public void setGruppyi(Gruppyi gruppyi) {
        this.gruppyi = gruppyi;
    }

    
    @Column(name="Familiya", nullable=false, length=30)
    public String getFamiliya() {
        return this.familiya;
    }
    
    public void setFamiliya(String familiya) {
        this.familiya = familiya;
    }

    
    @Column(name="Imya", nullable=false, length=30)
    public String getImya() {
        return this.imya;
    }
    
    public void setImya(String imya) {
        this.imya = imya;
    }

    
    @Column(name="Otchestvo", nullable=false, length=30)
    public String getOtchestvo() {
        return this.otchestvo;
    }
    
    public void setOtchestvo(String otchestvo) {
        this.otchestvo = otchestvo;
    }

    
    @Column(name="Gorod", nullable=false, length=30)
    public String getGorod() {
        return this.gorod;
    }
    
    public void setGorod(String gorod) {
        this.gorod = gorod;
    }

    
    @Column(name="Adres", nullable=false, length=80)
    public String getAdres() {
        return this.adres;
    }
    
    public void setAdres(String adres) {
        this.adres = adres;
    }

    
    @Column(name="Tel", nullable=false, length=30)
    public String getTel() {
        return this.tel;
    }
    
    public void setTel(String tel) {
        this.tel = tel;
    }

    
    @Column(name="Status", length=50)
    public String getStatus() {
        return this.status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="StatusDate", length=10)
    public Date getStatusDate() {
        return this.statusDate;
    }
    
    public void setStatusDate(Date statusDate) {
        this.statusDate = statusDate;
    }




}


