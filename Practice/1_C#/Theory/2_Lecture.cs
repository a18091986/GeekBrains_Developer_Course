void Method_1() {
    Console.WriteLine("Method_1");
}

Method_1();

void Method_2(string msg, int count) {
    int i = 0;
    while (i < count) {
        Console.WriteLine($"Message: {msg}, count: {i}");
        i++;
    }
}

Method_2(count: 5, msg: "TEST");

string Method_3(int count, char c) {
    int i = 0;
    string result = String.Empty;
    while (i < count) {
        result = result + c;
        i++;
    }
    return result;
}

Console.WriteLine(Method_3(10, 't'));


string Method_for(int count, char c) {
    string result = String.Empty;
    for (int i = 0; i < count; i++) {
        result = result + c;
    }
    return result;
}

Console.WriteLine(Method_for(10, 't'));

// Задача 1. Выввести таблицу умножения

for (int i = 2; i <= 10; i++) {
    for (int j = 2; j <= 10; j++) {
        Console.WriteLine($"{i}*{j}: {i*j}");
    }
    Console.WriteLine();
}


// Работа с текстом

// Дан текст. Требуется все пробелы заменить черточками, маленькие буквы к заменить на К, большие С заменить на с

string text = "Некоторый текСт";

string Replace(string text, char oldChar, char newChar) {
    string result = string.Empty;
    int length = text.Length;
    for (int i=0; i < length; i++) {
        if (text[i]==oldChar) result=result+newChar;
        else result=result+text[i];
    }
    return result;
}

text = Replace(text, ' ', '|');
text = Replace(text, 'к', 'К');
text = Replace(text, 'С', 'с');


Console.WriteLine(text);

// Сортировка методом выбора

int[] arr = {1,2,4,5,7,2,1,4,12,1,23};
void PrintArray(int[] array) {
    int count = array.Length;
    Console.WriteLine("Array: ");
    for (int i = 0; i < count; i++) {
        Console.Write($"{array[i]} ");
    }
    Console.WriteLine();
}

PrintArray(arr);

void SortArray(int[] array) {
    for (int i = 0; i < array.Length - 1; i++) {
        int min_position = i;
        for (int j = i + 1; j < array.Length; j++) {
            if (arr[j] < arr[min_position]) min_position = j;
        }
        int temp = arr[i];
        arr[i] = arr[min_position];
        arr[min_position] = temp;
    }
}

SortArray(arr);
PrintArray(arr);

