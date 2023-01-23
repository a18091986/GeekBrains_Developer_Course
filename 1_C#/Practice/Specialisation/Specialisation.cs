string [] GenerateRandomStringArray() {
    char[] letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890".ToCharArray();
    Console.Write("Input number of elements: ");
    int elements_count = Convert.ToInt32(Console.ReadLine());
    string [] out_list = new string[elements_count];
    for (int i = 0; i < elements_count; i++) {
        int element_len = new Random().Next(1, 5);
        // char [] current_string = new char[elements_count];
        string current_string = ""; 
        for (int j = 0; j < element_len; j++)
            current_string += letters[new Random().Next(0, letters.Length)];
        out_list[i] = current_string;
    }
    return out_list;
}

void ShowStringArray(string [] array) {
    Console.WriteLine();
    for (int j = 0; j < array.Length; j++) {
        Console.Write(array[j] + " ");
    }
    Console.WriteLine();
}

string [] new_string = GenerateRandomStringArray();

ShowStringArray(new_string);
