package search;
/*
  分块查找
  核心思想：
      块内无序，块间有序
  实现步骤：
      1.创建数组blockArr存放每一个块对象的信息
      2.先查找blockArr确定要查找的数据属于哪一块
      3.再单独遍历这一块数据即可
*/
public class BlockSearch01 {

    public static void main(String[] args) {
        int[] arr = {
                7,12,20,35,24,
                38,40,45,59,44,67,
                80,77,99,88,83,100};
        int key = 100;
        int index = getIndex(arr,key);
        System.out.println(index);

    }
    public static int getIndex(int[] arr, int key){
        Block b1 = new Block(7,35,0,4);
        Block b2 = new Block(38,67,5,10);
        Block b3 = new Block(80,100,11,16);
        //此处可改创建集合存储Block对象，依次循环即可
        if (key>=b1.getMin() && key<=b1.getMax()){
            for (int i = b1.getStartIndex(); i <=b1.getEndIndex() ; i++) {
                if(key == arr[i]){
                    return i;
                }
            }
        } else if (key>=b2.getMin() && key<=b2.getMax()) {
            for (int i = b2.getStartIndex(); i <=b2.getEndIndex() ; i++) {
                if(key == arr[i]){
                    return i;
                }
            }
        }else if (key>=b3.getMin() && key<=b3.getMax()) {
            for (int i = b3.getStartIndex(); i <=b3.getEndIndex() ; i++) {
                if(key == arr[i]){
                    return i;
                }
            }
        }
        return -1;
    }
    public static class Block{
        int min;
        int max;
        int startIndex;
        int endIndex;

        public Block() {
        }

        public Block(int min, int max, int startIndex, int endIndex) {
            this.max = max;
            this.min = min;
            this.startIndex = startIndex;
            this.endIndex = endIndex;
        }

        /**
         * 获取
         * @return max
         */
        public int getMax() {
            return max;
        }

        /**
         * 设置
         * @param max
         */
        public void setMax(int max) {
            this.max = max;
        }

        /**
         * 获取
         * @return min
         */
        public int getMin() {
            return min;
        }

        /**
         * 设置
         * @param min
         */
        public void setMin(int min) {
            this.min = min;
        }

        /**
         * 获取
         * @return startIndex
         */
        public int getStartIndex() {
            return startIndex;
        }

        /**
         * 设置
         * @param startIndex
         */
        public void setStartIndex(int startIndex) {
            this.startIndex = startIndex;
        }

        /**
         * 获取
         * @return endIndex
         */
        public int getEndIndex() {
            return endIndex;
        }

        /**
         * 设置
         * @param endIndex
         */
        public void setEndIndex(int endIndex) {
            this.endIndex = endIndex;
        }

        public String toString() {
            return "Block{max = " + max + ", min = " + min + ", startIndex = " + startIndex + ", endIndex = " + endIndex + "}";
        }
    }

}
