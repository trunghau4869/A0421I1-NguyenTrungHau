package Bai4_lop_va_doi_tuong_trong_java.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class XayDungLopStopWatch {
    private long startTime, endTime;

    public XayDungLopStopWatch() {
        this.startTime = System.currentTimeMillis();
    }

    public XayDungLopStopWatch(long startTime, long endTime) {
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public long getStartTime() {
        return startTime;
    }

    public void setStartTime(long startTime) {
        this.startTime = startTime;
    }

    public long getEndTime() {
        return endTime;
    }

    public void setEndTime(long endTime) {
        this.endTime = endTime;
    }

    public void Start() {
        this.startTime = System.currentTimeMillis();
    }

    public void Stop() {
        this.endTime = System.currentTimeMillis();

    }

    public long getElapsedTime() {
        return   this.endTime - this.startTime;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[] =new int[100000];
        for(int i=0;i<arr.length;i++){
            arr[i]= (int) (Math.random()*100000);
        }
        XayDungLopStopWatch stopWatch=new XayDungLopStopWatch();

        stopWatch.Start();
       Arrays.sort(arr);
        stopWatch.Stop();
        System.out.println(stopWatch.getElapsedTime());
    }
}
