package com.company;

class MyThread extends Thread
{
    @Override
    public void run()
    {
        for(int i = 0; i < 5; i++)
        {
            try{
                sleep(1000);
            }
            catch(InterruptedException e){}
            System.out.println("0");
        }
    }
}