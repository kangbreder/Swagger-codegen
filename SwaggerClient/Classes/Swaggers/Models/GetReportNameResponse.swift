//
// GetReportNameResponse.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation



public struct GetReportNameResponse: Codable {

    public var columnHeaders: ResultsetColumnHeaderData?
    public var row: ResultsetRowData?

    public init(columnHeaders: ResultsetColumnHeaderData?, row: ResultsetRowData?) {
        self.columnHeaders = columnHeaders
        self.row = row
    }


}

