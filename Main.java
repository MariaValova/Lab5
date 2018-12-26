
package com.company;
public class Main
{
    static Mythread mAnotherOpinion;

    public static void main(String[] args)
    {
        mAnotherOpinion = new Mythread();
        mAnotherOpinion.start();

        for(int i = 0; i < 5; i++)
        {
            try{
                Thread.sleep(1000);
            }catch(InterruptedException e){}

            System.out.println("1");
        }

        if(mAnotherOpinion.isAlive())
        {
            try{
                mAnotherOpinion.join();
            }
            catch(InterruptedException e){}
        }
    }
}