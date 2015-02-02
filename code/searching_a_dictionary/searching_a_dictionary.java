import Helper.txt;

Scanner sc = new Scanner(new File(Helper.txt));
List<String> lines = new ArrayList<String>();
while (sc.hasNextLine()) {
  lines.add(sc.nextLine());
}

String[] arr = lines.toArray(new String[0]);