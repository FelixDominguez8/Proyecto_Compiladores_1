; ModuleID = 'MiniPascal'
source_filename = "output.ll"
target datalayout = "e-m:w-p270:32:32-p271:32:32-p272:64:64-i64:64-i128:128-f80:128-n8:16:32:64-S128"
target triple = "x86_64-pc-windows-msvc19.34.31937"

@globalVar = global i32 0
@localVar = global i32 0
@localFuncVar = global i32 0
declare i32 @printf(i8*, ...)
define i32 @main() {
entry:
%_t0 = load i32, i32* @globalVar
%_t2 = add i32 %_t0, null
store i32 %_t0, i32* @localVar
%_t4 = load i32, i32* @localVar
call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([5 x i8], [5 x i8]* @.str0, i32 0, i32 0), i32 %_t4)
%_t6 = load i32, i32* @globalVar
call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([5 x i8], [5 x i8]* @.str1, i32 0, i32 0), i32 %_t6)
FuncionEjemplo :
%_t7 = load i32, i32* @x
%_t9 = mul i32 %_t7, null
store i32 %_t7, i32* @localFuncVar
%_t10 = load i32, i32* @localFuncVar
store i32 localFuncVar, i32* @FuncionEjemplo
%_t12 = load i32, i32* @localFuncVar
call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([5 x i8], [5 x i8]* @.str2, i32 0, i32 0), i32 %_t12)
store i32 writeln, i32* @%_t13
ret void
store i32 5, i32* @globalVar
call void @ProcesoEjemplo()
%_t16 = load i32, i32* @globalVar
call void @FuncionEjemplo()
store i32 %_t17, i32* @FuncionEjemplo(globalVar)
call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([5 x i8], [5 x i8]* @.str3, i32 0, i32 0), i32 FuncionEjemplo(globalVar))
%_t19 = load i32, i32* @globalVar
call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([5 x i8], [5 x i8]* @.str4, i32 0, i32 0), i32 %_t19)
ret i32 0
}
@.str0 = private unnamed_addr constant [5 x i8] c"%d\n\00", align 1
@.str1 = private unnamed_addr constant [5 x i8] c"%d\n\00", align 1
@.str2 = private unnamed_addr constant [5 x i8] c"%d\n\00", align 1
@.str3 = private unnamed_addr constant [5 x i8] c"%d\n\00", align 1
@.str4 = private unnamed_addr constant [5 x i8] c"%d\n\00", align 1
