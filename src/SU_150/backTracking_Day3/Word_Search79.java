package SU_150.backTracking_Day3;
//leetcode 79
public class Word_Search79 {
    public static void main(String[] args) {
        char[][] maze={{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
        String word="SFCS";
        for (int i = 0; i < maze.length; i++) {
            for (int j = 0; j <maze[0].length ; j++) {
                if(maze[i][j]==word.charAt(0)){
                   boolean ans= wordSearch(maze,i,j,word,0);
                    if(ans){
                        System.out.println(ans);
                        break;
                    }
                }
            }
        }
        System.out.println("false");
    }

    public static boolean wordSearch(char[][]maze,int cr,int cc,String word,int idx){
        if(idx==word.length()){
            return true;
        }
        if(cr<0||cc<0||cr>= maze.length||cc>=maze[0].length|| maze[cr][cc]!=word.charAt(idx)){
            return false;
        }
        int []row={-1,1,0,0};
        int[] col={0,0,-1,1};
        maze[cr][cc]='*';
        boolean ans =false;
        for (int i = 0; i <col.length ; i++) {
           ans= wordSearch(maze,cr+row[i],cc+col[i],word,idx+1);
           if(ans){
               return ans;
           }
        }
        maze[cr][cc]=word.charAt(idx);
        return false;
    }

}
