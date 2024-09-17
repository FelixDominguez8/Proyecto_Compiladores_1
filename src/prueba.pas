program TestFunctions;

var
    x, y: INTEGER;
    result: BOOLEAN;
    message: STRING;
    charVal: CHAR;

function Sum(a, b: INTEGER): INTEGER;
begin
    Sum := a + b;
end;

function IsEven(n: INTEGER): BOOLEAN;
begin
    if n mod 2 = 0 then
        IsEven := true;
    else
        IsEven := false;
end;

procedure UpdateValue(var a: INTEGER);
begin
    a := a * 2;
end;

function GetMessage(): STRING;
begin
    GetMessage := 'Hello, World!';
end;

function ConcatChars(var c1, c2: CHAR): STRING;
begin
    ConcatChars := c1 + c2;
end;

begin
    x := 5;
    y := 10;
    result := IsEven(Sum(x, y));
    WRITELN('Is the sum of ', x, ' and ', y, ' even? ', result);

    UpdateValue(x);
    WRITELN('Updated value of x: ', x);

    message := GetMessage();
    WRITELN('Message: ', message);

    charVal := 'A';
    WRITELN('Concatenated characters: ', ConcatChars(charVal, 'B'));
end.
