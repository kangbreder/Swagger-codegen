//
// GetGroupsTemplateColumnHeaderData.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation



public struct GetGroupsTemplateColumnHeaderData: Codable {

    public var columnName: String?
    public var columnType: String?
    public var columnLength: Int?
    public var columnDisplayType: String?
    public var isColumnNullable: Bool?
    public var isColumnPrimaryKey: Bool?
    public var columnValues: [GetGroupsTemplateColumnValues]?

    public init(columnName: String?, columnType: String?, columnLength: Int?, columnDisplayType: String?, isColumnNullable: Bool?, isColumnPrimaryKey: Bool?, columnValues: [GetGroupsTemplateColumnValues]?) {
        self.columnName = columnName
        self.columnType = columnType
        self.columnLength = columnLength
        self.columnDisplayType = columnDisplayType
        self.isColumnNullable = isColumnNullable
        self.isColumnPrimaryKey = isColumnPrimaryKey
        self.columnValues = columnValues
    }


}

