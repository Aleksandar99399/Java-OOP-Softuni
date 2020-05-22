package src.InterfaceAndAbstractionExercises.Telephony;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class Smartphone implements Callable,Browsable {
    private List<String>numbers;
    private List<String>urls;

    public Smartphone(List<String>numbers,List<String>urls){
        this.numbers= new ArrayList<>();
        this.urls= new ArrayList<>();

        this.numbers.addAll(numbers);
        this.urls.addAll(urls);
    }

    public List<String> getNumbers() {
        return numbers;
    }

    public List<String> getUrls() {
        return urls;
    }

    @Override
    public String browse() {
        StringBuilder sb = new StringBuilder();

        for (String url : this.getUrls())
            sb.append(Pattern.compile("\\d").matcher(url).find() ? "Invalid URL!" : String.format("Browsing: %s!", url)).append(System.lineSeparator());

        return sb.toString();
    }

    @Override
    public String call() {
        StringBuilder sb = new StringBuilder();

        for (String number : this.getNumbers())
            sb.append(Pattern.compile("[^\\d]").matcher(number).find() ? "Invalid number!" : "Calling... " + number).append(System.lineSeparator());

        return sb.toString();
    }




}
