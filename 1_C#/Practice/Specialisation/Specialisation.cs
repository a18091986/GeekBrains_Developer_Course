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
    Console.Write("[");
    for (int j = 0; j < array.Length; j++) {
        if (j != array.Length - 1)
            Console.Write("'" + array[j] + "'" + ", ");
        else
            Console.Write("'" + array[j] + "'");
    }
    Console.Write("]");
    Console.WriteLine();
}

string [] FilterArrayByStringLength(string [] input_array) {
    string [] filtered_array = new string [input_array.Length];
    int filtered_array_position = 0;
    for (int i = 0; i < input_array.Length; i++)
        if (input_array[i].Length <= 3)
            filtered_array[filtered_array_position++] = input_array[i];
    return filtered_array;
}

string [] new_string = GenerateRandomStringArray();
ShowStringArray(new_string);
string [] filtered_array = FilterArrayByStringLength(new_string);
ShowStringArray(filtered_array);
