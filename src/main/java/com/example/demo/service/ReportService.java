package com.example.demo.service;

import com.example.demo.model.Report;
import com.example.demo.repository.ReportRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class ReportService {

    @Autowired
    private ReportRepository reportRepository;

    public Report createReport(Report report) {
        report.setTimestamp(LocalDateTime.now());
        return reportRepository.save(report);
    }
}
