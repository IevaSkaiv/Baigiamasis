# Baigiamasis darbas
Pasirinkta testuoti svetainė: https://www.tiketa.lt/LT

# Tests:
1. Test search function:
   * enter text in input field *"Paieška"*; (We enter "labas")
   * click search icon;
   * check if text appears in results. (We check if one of the result names contains "labas")
   
2. Try logging in using valid email and valid password:
    * click button *"Prisijunk"*;
    * enter valid email address;
    * enter valid password;
    * check to see if an user icon appears. 
   
   (Email and Password are in Constants file so before testing you need to fill it up)

3. Try changing password:
    * (before doing these steps you need to log in);
    * click on username (top left corner);
    * click *"Mano duomenys"*;
    * click *"Slaptažodžio keitimas"*;
    * enter new valid password;
    * repeat new password;
    * check the message saying that the password was changed

4. Try changing user info (first name and last name):
   * (before doing these steps you need to log in);
   * click on username (top left corner);
   * click *"Mano duomenys"*;
   * click *"Asmeniniai duomenys"*;
   * enter new first name;
   * enter new last name;
   * click to save data;
   * refresh page and check if new account info is shown correctly in the top left corner.

5. Try adding 1 gift card to cart:
   * (before doing these steps you need to log in);
   * click *"DOVANŲ ČEKIAI"*;
   * click on the first gift card in list;
   * click *"Pirkti"*;
   * click *"10 eur"* in frame;
   * click *"Ieškoti bilietų"*;
   * check if 1 ticked appeared in cart;