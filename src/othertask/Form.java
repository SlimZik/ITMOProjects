package othertask;

class Form {

    private String form;
    private String name;
    private int year;

    Form(){

        form = "неизвестно";
        name = "неизвестно";
        year = 0;
    }
    Form(String form, String name, int year){
        this.form = form;
        this.name = name;
        this.year = year;
    }
    void info(){
        System.out.printf("Личное дело - '%s' (ФИО: %s) принят на работу в %d году \n", form, name, year);
    }
}
