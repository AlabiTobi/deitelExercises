package chapterTwo;

public class Native {

    private String name;
    private int scvId;

public void setName (String aNewName){
    name = aNewName;

}

public void setScvId (int scvId) {
    this.scvId= scvId;
}


public String getName(){
    return name;
}


public String getScvId (){
    return "SCV1000" + scvId;


}

}
