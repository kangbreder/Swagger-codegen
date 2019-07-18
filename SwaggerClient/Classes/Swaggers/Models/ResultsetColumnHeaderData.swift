//
// ResultsetColumnHeaderData.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation



public struct ResultsetColumnHeaderData: Codable {

    public var columnName: String?
    public var columnType: String?
    public var columnLength: Int64?
    public var columnDisplayType: String?
    public var columnCode: String?
    public var dateDisplayType: Bool?
    public var dateTimeDisplayType: Bool?
    public var integerDisplayType: Bool?
    public var decimalDisplayType: Bool?
    public var booleanDisplayType: Bool?
    public var codeValueDisplayType: Bool?
    public var codeLookupDisplayType: Bool?
    public var string: Bool?
    public var mandatory: Bool?
    public var _optional: Bool?

    public init(columnName: String?, columnType: String?, columnLength: Int64?, columnDisplayType: String?, columnCode: String?, dateDisplayType: Bool?, dateTimeDisplayType: Bool?, integerDisplayType: Bool?, decimalDisplayType: Bool?, booleanDisplayType: Bool?, codeValueDisplayType: Bool?, codeLookupDisplayType: Bool?, string: Bool?, mandatory: Bool?, _optional: Bool?) {
        self.columnName = columnName
        self.columnType = columnType
        self.columnLength = columnLength
        self.columnDisplayType = columnDisplayType
        self.columnCode = columnCode
        self.dateDisplayType = dateDisplayType
        self.dateTimeDisplayType = dateTimeDisplayType
        self.integerDisplayType = integerDisplayType
        self.decimalDisplayType = decimalDisplayType
        self.booleanDisplayType = booleanDisplayType
        self.codeValueDisplayType = codeValueDisplayType
        self.codeLookupDisplayType = codeLookupDisplayType
        self.string = string
        self.mandatory = mandatory
        self._optional = _optional
    }

    public enum CodingKeys: String, CodingKey { 
        case columnName
        case columnType
        case columnLength
        case columnDisplayType
        case columnCode
        case dateDisplayType
        case dateTimeDisplayType
        case integerDisplayType
        case decimalDisplayType
        case booleanDisplayType
        case codeValueDisplayType
        case codeLookupDisplayType
        case string
        case mandatory
        case _optional = "optional"
    }


}
