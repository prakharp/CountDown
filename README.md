In this application we create application listview count down timer in android using Handler class.There lot of problem using countDown timer in list as we have create mulitple count down thread as getview method would be create this would slow down listview and it even scroll correctly in the worst cases
Alternely  I'm handling it the following way : in the Custom List Adapter, inside Adapter I create a new Hander and running  ever 1 sec subtracting 1 sec from count thus display remaining time inside lisvtview TextView.


