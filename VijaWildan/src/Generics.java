class Country<C> {
    C obj;

    Country(C obj) {
        this.obj = obj;
    } 

    public C getObject() {
        return this.obj;
    }
}

enum secClearance {
    Confidentail,
    Secret,
    TopSecret
}


class Main {
    public static void main(String[] args) {
        
        Country<String> sObj = new Country<String>("Azerbaijan");
        secClearance clearance = secClearance.Secret;

        System.out.println(sObj.getObject());
        System.out.println(clearance);
    }
}