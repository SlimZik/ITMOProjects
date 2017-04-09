package HomeWork.Lesson4.BookLibrary;

 /*Библиотека*/


class BItem {
    private int counter;

    void cntUp(int n) {
        counter += n;
    }

    void cntDown(int n) {
        counter -= n;
    }

    int getCounter() {
        return counter;
    }
}
