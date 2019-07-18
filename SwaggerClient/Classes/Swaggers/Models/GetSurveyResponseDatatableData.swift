//
// GetSurveyResponseDatatableData.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation



public struct GetSurveyResponseDatatableData: Codable {

    public var applicationTableName: String?
    public var registeredTableName: String?
    public var columnHeaderData: [ResultsetColumnHeaderData]?

    public init(applicationTableName: String?, registeredTableName: String?, columnHeaderData: [ResultsetColumnHeaderData]?) {
        self.applicationTableName = applicationTableName
        self.registeredTableName = registeredTableName
        self.columnHeaderData = columnHeaderData
    }


}
