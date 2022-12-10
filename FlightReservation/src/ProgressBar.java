/*
 * used another class to performe the function.
 * 
 * 
 * public class ProgressBar {
 * 
 * private static final StringBuilder res = new StringBuilder();
 * 
 * static String progress(int pct) {
 * res.delete(0, res.length());
 * int numPounds = (pct + 9) / 10;
 * for (int i = 0 ; i != numPounds ; i++) {
 * res.append('#');
 * }
 * while (res.length() != 10) {
 * res.append(' ');
 * }
 * return res.toString();
 * }
 * 
 * public void loadBar() throws InterruptedException{
 * for (int i = 0 ; i <= 100 ; i+=Math.random() *8) {
 * Thread.sleep(50);
 * System.out.print(String.format("[%s]%d%%\r", progress(i), i));
 * }
 * }
 * }
 */