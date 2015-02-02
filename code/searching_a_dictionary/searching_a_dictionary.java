import Helper.txt;

Scanner sc = new Scanner(new File(Helper.txt));
List<String> lines = new ArrayList<String>();
while (sc.hasNextLine()) {
  lines.add(sc.nextLine());
}

String[] textarray = lines.toArray(new String[0]);


function getAllIndexes(arr, val) {
    var indexes = [], i = -1;
    while ((i = arr.indexOf(val, i+1)) != -1){
        indexes.push(i);
    }
    return indexes;
}

var indexes = getAllIndexes(textarray, "She");

