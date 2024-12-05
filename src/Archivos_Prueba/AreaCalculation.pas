program SimpleRectangleArea;

var
    length1, width, area: integer;

begin
    { Initialize rectangle dimensions }
    length1 := 10;
    width := 5;

    { Calculate the area of the rectangle }
    area := length1 * width;

    { Display the area }
    write(area);

    { Simple if-else condition }
    if area > 25 then
        write(1)  { Output 1 if the area is greater than 25 }
    {else}
        {write(0);}
        { Output 0 if the area is 25 or less }
end.
