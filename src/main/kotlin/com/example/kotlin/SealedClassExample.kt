package com.example.kotlin

sealed interface Error

class FileError(val fileName: String) : Error
class DBError(val dbmsType: DbmsType) : Error
class OSError(val osType: OsType) : Error

enum class OsType {
    WINDOWS, MAC_OS,LINUX
}

enum class DbmsType {
    MYSQL, MARIA, ORACLE, H2
}

fun getCharacter(error: Error) = when(error) {
    is FileError -> "Error is occurred at ${error.fileName}"
    is DBError -> "Error on DBMS : ${error.dbmsType}"

//sealed class로 하지 않은 경우 아래와 같이 불필요한 else 문을 넣어주어야 함
//    else -> throw IllegalArgumentException("Unknown error type")

    // sealed class를 사용하면 osError 에 대한 것을 추가해주어야 하는 것을 컴파일러가 찾아줌
    is OSError -> "Error on OS : ${error.osType}"
}

fun main() {
    println(getCharacter(FileError("hey")))
    println(getCharacter(DBError(DbmsType.MYSQL)))
    println(getCharacter(OSError(OsType.WINDOWS)))
}
