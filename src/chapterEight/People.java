package chapterEight;

public enum People {
    WORM ("Amaka"),
    DEJI(),
    BUNMI ("Love", "Florence");
    private String[] boyFriendName;

    People (String name) {
        boyFriendName = new String[1];
        boyFriendName[0] = name;
    }

    People (String... names) {
        boyFriendName = names;
    }

    public String[] getBoyFriendName(){
    return boyFriendName;
}
    public void greetBoyFriend(){
        for(String boyfriend: boyFriendName){
            System.out.println ("Hello" + boyfriend);
        }
    }
    public String toString(){
        switch(this){
            case DEJI:  return "Deji";
            case WORM:  return "Worm";
            case BUNMI: return "King Bumi";
            default: return null;
        }
    }
}
