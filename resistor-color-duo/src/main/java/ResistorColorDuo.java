class ResistorColorDuo {
    public enum Color{
        black("0"), brown("1"), red("2"), orange("3"), yellow("4"),green("5"), blue("6"), violet("7"), grey("8"), white("9");
        
        private final String number;
        private Color(String number){
            this.number = number;
        }

        public String getColorNUmber(){
            return this.number;
        }

    }
    int value(String[] colors) {
       return Integer.parseInt(Color.valueOf(colors[0]).getColorNUmber() + 
       Color.valueOf(colors[1]).getColorNUmber());
    }
}
