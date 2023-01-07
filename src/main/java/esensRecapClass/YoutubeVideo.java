package esensRecapClass;

public  class YoutubeVideo {

        String title;
        String comments;
        int views;
        int likes;
        boolean isPrivate;


    public  void watch(){
        views++; //views = vies +1;

    }
    public void like() {
        //if(isPrivate){
       // System.out.println();
        likes++;
    }
        public void comment(String newComment){
        comments = comments + "\n" + newComment;

    }
        public void makePrivate(){
        isPrivate = true;

   }
        }

