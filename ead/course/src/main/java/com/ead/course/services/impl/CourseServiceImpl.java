package com.ead.course.services.impl;

import com.ead.course.repositories.CourseRepository;
import com.ead.course.services.CourseService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class CourseServiceImpl implements CourseService {
    private final CourseRepository courseRepository;
}
