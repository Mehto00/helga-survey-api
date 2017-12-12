package helga.survey.model;

import javax.persistence.*;

@Entity
public class Answer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ANSWER_ID")
    private Long answerId; // Automatically generated answer Id number

    @Column(name = "IKA")
    private String ika;

    @Column(name = "SUKUPUOLI")
    private String sukupuoli;

    @Column(name = "KAMPUS")
    private String kampus;

    @Column(name = "JASENYYS")
    private String jasenyys;

    @Column(name = "HYOTY")
    private String hyoty;

    @Column(name = "EVKAYTTO")
    private String evkaytto;

    @Column(name = "EVONGELMA")
    private String evongelma;

    @Column(name = "KERHOTOIMINTA")
    private String kerhotoiminta;

    @Column(name = "TAPAHTUMAT")
    private String tapahtumat;

    @Column(name = "TUTOROINTI")
    private String tutorointi;

    @Column(name = "VAPAA")
    private String vapaa;



    // ======== Constructors: ======== //

    protected Answer(){}

    public Answer(String ika, String sukupuoli, String kampus, String jasenyys, String hyoty, String evkaytto, String evongelma, String laatu, String arviointi, String ristiriita, String tyoharjoittelu, String kuormittavuus, String lasnaolo, String opetusteknologia, String kerhotoiminta, String tapahtumat, String tutorointi, String vapaa) {

        String concat;
        String [] ongelmat= new String[7];
        ongelmat[0] = laatu;
        ongelmat[1] = arviointi;
        ongelmat[2] = ristiriita;
        ongelmat[3] = tyoharjoittelu;
        ongelmat[4] = kuormittavuus;
        ongelmat[5] = lasnaolo;
        ongelmat[6] = opetusteknologia;
        concat = ongelmatArrayToString(ongelmat);

        this.ika = ika;
        this.sukupuoli = sukupuoli;
        this.kampus = kampus;
        this.jasenyys = jasenyys;
        this.hyoty = hyoty;
        this.evkaytto = evkaytto;
        this.evongelma = concat;
        this.kerhotoiminta = kerhotoiminta;
        this.tapahtumat = tapahtumat;
        this.tutorointi = tutorointi;
        this.vapaa = vapaa;
    }


// ======== Getters / Setters: ======== //

    public Long getAnswerId() {
        return answerId;
    }

    public String ongelmatArrayToString(String[] ongelmat){
        String answer = "";
        for (int i = 0; i <ongelmat.length ; i++) {
            if (ongelmat[i]!= null){
                answer = answer + ongelmat[i] + " ";
            }
        }
        return  answer;
    }

    // This one overrides toString to print the Survey and it properties
    @Override
    public String toString() {
        return " {" +
                "\"answerId\" : " + answerId + "," +
                "\"ika\" : \"" + ika + "\"," +
                "\"sukupuoli\" : \"" + sukupuoli + "\"," +
                "\"kampus\" : \"" + kampus + "\"," +
                "\"jasenyys\" : \"" + jasenyys + "\"," +
                "\"hyoty\" : \"" + hyoty + "\"," +
                "\"ev_kaytto\" : \"" + evkaytto + "\"," +
                "\"ev_ongelma\" : \"" + evongelma + "\"," +
                "\"kerhotoiminta\" : \"" + kerhotoiminta + "\"," +
                "\"tapahtumat\" : \"" + tapahtumat + "\"," +
                "\"tutorointi\" : \"" + tutorointi + "\"," +
                "\"vapaa\" : \"" + vapaa + "\"" +
                '}';
    }
}
