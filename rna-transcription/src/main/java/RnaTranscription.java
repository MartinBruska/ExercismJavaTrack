class RnaTranscription {

    String transcribe(String dnaStrand) {
        StringBuilder sb = new StringBuilder();
        dnaStrand.chars().forEach(letter -> sb.append(transfer(String.valueOf((char) letter))));
        System.out.println(sb);
        return sb.toString();
    }

    private String transfer(String letter) {
        switch (letter) {
            case "G":
                return "C";
            case "C":
                return "G";
            case "T":
                return "A";
            case "A":
                return "U";
            default:
                return "";
        }
    }
}
