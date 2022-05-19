package com;

import java.util.Arrays;
import java.util.List;

public class DistanceBasedStrategy implements StrategyType {

    private boolean reverse;
    public DistanceBasedStrategy() {
        this.reverse = false;
    }

    public DistanceBasedStrategy(boolean reverse) {
        this.reverse = reverse;
    }

    public boolean isReverse() {
        return reverse;
    }

    public void setReverse(boolean reverse) {
        this.reverse = reverse;
    }

    @Override
    public void strategy(Individual individual1, Individual individual2,Individual individual3) {
        int x1=individual1.getCoord().getX();
        int y1=individual1.getCoord().getY();
        int x2=individual2.getCoord().getX();
        int y2=individual2.getCoord().getY();
        int x3=individual3.getCoord().getX();
        int y3=individual3.getCoord().getY();

        if(reverse){
            System.out.println("你使用了遠距離配對模式");
        }else {
            System.out.println("你使用了近距離配對模式");
        }

        int d12=calculateDistance(x1,y1,x2,y2);
        System.out.printf("%d 號 與 %d 號 的距離為 %d \n",individual1.getId(),individual2.getId(),d12);

        int d13=calculateDistance(x1,y1,x3,y3);

        System.out.printf("%d 號 與 %d 號 的距離為 %d \n",individual1.getId(),individual3.getId(),d13);

        int num=matchNum(Arrays.asList(d12,d13));
        System.out.printf("%d 號 與 %d 號 配對成功 \n",individual1.getId(),num==2?individual2.getId():individual3.getId());
    }


    private int calculateDistance(int x1,int y1,int x2,int y2){
        return (int)Math.sqrt(Math.pow((x1-x2),2)+Math.pow((y1-y2),2));
    }


    /**
     * 配對編號 取得
     * index=0 為第二位 individual2
     * index=1 為第三位 individual2 故+2
     * @param list
     * @return
     */
    private int matchNum(List<Integer> list){
        return list.indexOf(strategyChoice(list))+2;
    }

    /**
     * 選擇正向或反向策略
     * @param list
     * @return
     */
    private int strategyChoice(List<Integer> list){
        return reverse?list.stream().max(Integer::compare).get()
                      :list.stream().min(Integer::compare).get();
    }
}
