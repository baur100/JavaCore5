package JavaExersices;

public class App1 {
    public static void main(String[] args) {
        String xx = "https://www.google.com/search?sxsrf=ALeKk0298LRvDz9AHROr9eq6v0kejsjrCw%3A1601001568365&source=hp&ei=YFhtX7SAE_Dl_Qbfv4OgAQ&q=java&oq=java&gs_lcp=CgZwc3ktYWIQAzIECCMQJzIECCMQJzIECCMQJzIECAAQQzIECAAQQzIFCAAQkQIyBQgAEJECMgQIABBDMgcIABCxAxBDMgQIABBDOgcIIxDqAhAnOgUILhCRAjoFCAAQsQM6BQguELEDOgIILjoLCC4QsQMQxwEQowI6CAgAELEDEIMBOggILhCxAxCDAToECC4QQ1CtFVj7GmC0H2gCcAB4AIABUYgBnAKSAQE0mAEAoAEBqgEHZ3dzLXdperABCg&sclient=psy-ab&ved=0ahUKEwi0sI7Oo4PsAhXwct8KHd_fABQQ4dUDCAk&uact=5";
        String[] spl = xx.split("\\?");
        String params = spl[1];
        String[]pr = params.split("&");
        for (String v : pr){
            System.out.println(v.split("=")[0]+": "+v.split("=")[1]);
        }
    }
}
