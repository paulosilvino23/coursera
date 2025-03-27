package com.lq.annotations;

import java.lang.annotation.Annotation;
import static java.lang.System.out;

public class AnnotationExerciser {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		
		Class[] classes = { UseAnnotation.class };
		
		for (Class classObj : classes ) {
			Annotation[] annotations = classObj.getAnnotations();
			out.println("Number of annotations: " + annotations.length);
			for (Annotation annotation : annotations) {
				MyAnnotation a = (MyAnnotation)annotation;
				out.println(a.name());
			}
		}

	}

}
