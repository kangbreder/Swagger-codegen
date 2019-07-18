//
// PutReportMailingJobsRequest.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation



public struct PutReportMailingJobsRequest: Codable {

    public var locale: String?
    public var dateFormat: String?
    public var startDateTime: Date?

    public init(locale: String?, dateFormat: String?, startDateTime: Date?) {
        self.locale = locale
        self.dateFormat = dateFormat
        self.startDateTime = startDateTime
    }


}
